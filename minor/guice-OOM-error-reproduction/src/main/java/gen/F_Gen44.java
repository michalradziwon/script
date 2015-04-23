
  package gen;
  public class F_Gen44 {
  		@com.google.inject.Inject
  		public F_Gen44(F_Gen45 f_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  