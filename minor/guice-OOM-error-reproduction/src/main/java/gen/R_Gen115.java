
  package gen;
  public class R_Gen115 {
  		@com.google.inject.Inject
  		public R_Gen115(R_Gen116 r_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  