
  package gen;
  public class D_Gen103 {
  		@com.google.inject.Inject
  		public D_Gen103(D_Gen104 d_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  