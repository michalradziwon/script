
  package gen;
  public class F_Gen69 {
  		@com.google.inject.Inject
  		public F_Gen69(F_Gen70 f_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  