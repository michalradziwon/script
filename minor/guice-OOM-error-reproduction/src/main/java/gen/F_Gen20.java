
  package gen;
  public class F_Gen20 {
  		@com.google.inject.Inject
  		public F_Gen20(F_Gen21 f_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  