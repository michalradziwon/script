
  package gen;
  public class A_Gen29 {
  		@com.google.inject.Inject
  		public A_Gen29(A_Gen30 a_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  