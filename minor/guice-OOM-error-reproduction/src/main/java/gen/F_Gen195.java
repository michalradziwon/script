
  package gen;
  public class F_Gen195 {
  		@com.google.inject.Inject
  		public F_Gen195(F_Gen196 f_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  