
  package gen;
  public class R_Gen184 {
  		@com.google.inject.Inject
  		public R_Gen184(R_Gen185 r_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  