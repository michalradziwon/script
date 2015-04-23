
  package gen;
  public class F_Gen171 {
  		@com.google.inject.Inject
  		public F_Gen171(F_Gen172 f_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  