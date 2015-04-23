
  package gen;
  public class R_Gen82 {
  		@com.google.inject.Inject
  		public R_Gen82(R_Gen83 r_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  