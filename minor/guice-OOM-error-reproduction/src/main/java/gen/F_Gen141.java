
  package gen;
  public class F_Gen141 {
  		@com.google.inject.Inject
  		public F_Gen141(F_Gen142 f_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  