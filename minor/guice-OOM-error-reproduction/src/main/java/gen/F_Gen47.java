
  package gen;
  public class F_Gen47 {
  		@com.google.inject.Inject
  		public F_Gen47(F_Gen48 f_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  