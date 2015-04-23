
  package gen;
  public class F_Gen126 {
  		@com.google.inject.Inject
  		public F_Gen126(F_Gen127 f_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  