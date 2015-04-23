
  package gen;
  public class F_Gen163 {
  		@com.google.inject.Inject
  		public F_Gen163(F_Gen164 f_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  