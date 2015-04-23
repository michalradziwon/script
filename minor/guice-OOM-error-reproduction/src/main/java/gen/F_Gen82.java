
  package gen;
  public class F_Gen82 {
  		@com.google.inject.Inject
  		public F_Gen82(F_Gen83 f_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  