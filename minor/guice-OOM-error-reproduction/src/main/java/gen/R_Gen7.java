
  package gen;
  public class R_Gen7 {
  		@com.google.inject.Inject
  		public R_Gen7(R_Gen8 r_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  