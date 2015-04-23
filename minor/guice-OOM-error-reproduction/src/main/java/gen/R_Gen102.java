
  package gen;
  public class R_Gen102 {
  		@com.google.inject.Inject
  		public R_Gen102(R_Gen103 r_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  