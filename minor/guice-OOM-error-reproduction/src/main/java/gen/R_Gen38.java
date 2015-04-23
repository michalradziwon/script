
  package gen;
  public class R_Gen38 {
  		@com.google.inject.Inject
  		public R_Gen38(R_Gen39 r_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  