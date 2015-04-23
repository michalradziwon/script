
  package gen;
  public class D_Gen116 {
  		@com.google.inject.Inject
  		public D_Gen116(D_Gen117 d_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  