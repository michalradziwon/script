
  package gen;
  public class R_Gen162 {
  		@com.google.inject.Inject
  		public R_Gen162(R_Gen163 r_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  