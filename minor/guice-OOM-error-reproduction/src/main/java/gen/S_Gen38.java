
  package gen;
  public class S_Gen38 {
  		@com.google.inject.Inject
  		public S_Gen38(S_Gen39 s_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  