
  package gen;
  public class F_Gen32 {
  		@com.google.inject.Inject
  		public F_Gen32(F_Gen33 f_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  