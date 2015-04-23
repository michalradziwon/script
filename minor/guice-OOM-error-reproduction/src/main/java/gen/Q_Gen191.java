
  package gen;
  public class Q_Gen191 {
  		@com.google.inject.Inject
  		public Q_Gen191(Q_Gen192 q_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  