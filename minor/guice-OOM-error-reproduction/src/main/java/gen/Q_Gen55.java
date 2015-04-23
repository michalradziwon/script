
  package gen;
  public class Q_Gen55 {
  		@com.google.inject.Inject
  		public Q_Gen55(Q_Gen56 q_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  