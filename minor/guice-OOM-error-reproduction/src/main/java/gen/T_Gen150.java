
  package gen;
  public class T_Gen150 {
  		@com.google.inject.Inject
  		public T_Gen150(T_Gen151 t_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  