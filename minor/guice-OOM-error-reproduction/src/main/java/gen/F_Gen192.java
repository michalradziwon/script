
  package gen;
  public class F_Gen192 {
  		@com.google.inject.Inject
  		public F_Gen192(F_Gen193 f_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  