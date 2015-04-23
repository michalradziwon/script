
  package gen;
  public class A_Gen102 {
  		@com.google.inject.Inject
  		public A_Gen102(A_Gen103 a_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  