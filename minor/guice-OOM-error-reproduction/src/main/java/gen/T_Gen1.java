
  package gen;
  public class T_Gen1 {
  		@com.google.inject.Inject
  		public T_Gen1(T_Gen2 t_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  