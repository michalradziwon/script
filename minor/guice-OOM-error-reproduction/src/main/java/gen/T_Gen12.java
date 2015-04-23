
  package gen;
  public class T_Gen12 {
  		@com.google.inject.Inject
  		public T_Gen12(T_Gen13 t_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  