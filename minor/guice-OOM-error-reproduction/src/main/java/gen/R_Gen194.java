
  package gen;
  public class R_Gen194 {
  		@com.google.inject.Inject
  		public R_Gen194(R_Gen195 r_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  