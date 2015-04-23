
  package gen;
  public class F_Gen139 {
  		@com.google.inject.Inject
  		public F_Gen139(F_Gen140 f_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  