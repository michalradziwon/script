
  package gen;
  public class A_Gen54 {
  		@com.google.inject.Inject
  		public A_Gen54(A_Gen55 a_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  