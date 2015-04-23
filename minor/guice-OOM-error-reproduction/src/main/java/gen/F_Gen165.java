
  package gen;
  public class F_Gen165 {
  		@com.google.inject.Inject
  		public F_Gen165(F_Gen166 f_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  