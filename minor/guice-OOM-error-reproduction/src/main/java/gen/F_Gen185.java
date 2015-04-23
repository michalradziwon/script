
  package gen;
  public class F_Gen185 {
  		@com.google.inject.Inject
  		public F_Gen185(F_Gen186 f_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  