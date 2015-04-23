
  package gen;
  public class F_Gen164 {
  		@com.google.inject.Inject
  		public F_Gen164(F_Gen165 f_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  