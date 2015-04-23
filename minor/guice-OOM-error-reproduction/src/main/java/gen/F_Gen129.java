
  package gen;
  public class F_Gen129 {
  		@com.google.inject.Inject
  		public F_Gen129(F_Gen130 f_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  