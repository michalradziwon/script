
  package gen;
  public class F_Gen196 {
  		@com.google.inject.Inject
  		public F_Gen196(F_Gen197 f_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  