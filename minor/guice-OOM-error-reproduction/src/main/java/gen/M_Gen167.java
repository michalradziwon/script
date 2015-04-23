
  package gen;
  public class M_Gen167 {
  		@com.google.inject.Inject
  		public M_Gen167(M_Gen168 m_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  