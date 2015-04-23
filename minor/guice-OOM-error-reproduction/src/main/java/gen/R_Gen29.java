
  package gen;
  public class R_Gen29 {
  		@com.google.inject.Inject
  		public R_Gen29(R_Gen30 r_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  