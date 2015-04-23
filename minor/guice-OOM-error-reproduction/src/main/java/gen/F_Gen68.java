
  package gen;
  public class F_Gen68 {
  		@com.google.inject.Inject
  		public F_Gen68(F_Gen69 f_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  