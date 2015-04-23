
  package gen;
  public class F_Gen142 {
  		@com.google.inject.Inject
  		public F_Gen142(F_Gen143 f_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  