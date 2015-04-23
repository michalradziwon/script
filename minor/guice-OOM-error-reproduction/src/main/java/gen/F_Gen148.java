
  package gen;
  public class F_Gen148 {
  		@com.google.inject.Inject
  		public F_Gen148(F_Gen149 f_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  