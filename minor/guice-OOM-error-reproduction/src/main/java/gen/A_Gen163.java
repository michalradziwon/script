
  package gen;
  public class A_Gen163 {
  		@com.google.inject.Inject
  		public A_Gen163(A_Gen164 a_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  