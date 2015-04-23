
  package gen;
  public class H_Gen38 {
  		@com.google.inject.Inject
  		public H_Gen38(H_Gen39 h_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  