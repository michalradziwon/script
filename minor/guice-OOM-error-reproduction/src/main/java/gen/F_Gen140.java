
  package gen;
  public class F_Gen140 {
  		@com.google.inject.Inject
  		public F_Gen140(F_Gen141 f_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  