
  package gen;
  public class T_Gen88 {
  		@com.google.inject.Inject
  		public T_Gen88(T_Gen89 t_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  