
  package gen;
  public class R_Gen104 {
  		@com.google.inject.Inject
  		public R_Gen104(R_Gen105 r_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  