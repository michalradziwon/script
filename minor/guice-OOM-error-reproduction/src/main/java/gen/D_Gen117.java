
  package gen;
  public class D_Gen117 {
  		@com.google.inject.Inject
  		public D_Gen117(D_Gen118 d_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  