
  package gen;
  public class A_Gen7 {
  		@com.google.inject.Inject
  		public A_Gen7(A_Gen8 a_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  