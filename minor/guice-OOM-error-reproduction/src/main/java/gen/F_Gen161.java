
  package gen;
  public class F_Gen161 {
  		@com.google.inject.Inject
  		public F_Gen161(F_Gen162 f_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  