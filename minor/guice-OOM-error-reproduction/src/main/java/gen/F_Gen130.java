
  package gen;
  public class F_Gen130 {
  		@com.google.inject.Inject
  		public F_Gen130(F_Gen131 f_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  