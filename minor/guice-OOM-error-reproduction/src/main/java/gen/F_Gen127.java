
  package gen;
  public class F_Gen127 {
  		@com.google.inject.Inject
  		public F_Gen127(F_Gen128 f_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  