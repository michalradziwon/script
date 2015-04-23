
  package gen;
  public class Q_Gen150 {
  		@com.google.inject.Inject
  		public Q_Gen150(Q_Gen151 q_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  