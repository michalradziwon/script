
  package gen;
  public class F_Gen170 {
  		@com.google.inject.Inject
  		public F_Gen170(F_Gen171 f_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  