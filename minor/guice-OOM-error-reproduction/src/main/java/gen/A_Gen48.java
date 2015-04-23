
  package gen;
  public class A_Gen48 {
  		@com.google.inject.Inject
  		public A_Gen48(A_Gen49 a_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  